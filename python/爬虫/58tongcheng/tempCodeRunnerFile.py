def get_links_from(channel,page,who_sell=0):
    
        list_url = '{}{}/pn{}/'.format(channel, str(who_sell), str(page))
        web_data = requests.get(list_url)
        time.sleep(0.7)
        soup = BeautifulSoup(web_data.text, 'lxml')
        if soup.find('td', 't'):
                for link in soup.select('td.t a.t'):
                        item_link = link.get('href').split('?')[0]
                        url_list.insert_one({'url':item_link})
                        print(item_link)
        else:
  
