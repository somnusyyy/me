from bs4 import BeautifulSoup
import time
import requests
import pymongo

client = pymongo.MongoClient('localhost', 27017)
_58tongcheng = client['_58tongcheng']
url_list = _58tongcheng['item_list1']
item_info = _58tongcheng['item_info1']


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
                pass



def get_item_info(url):
        web_data = requests.get(url)
        soup = BeautifulSoup(web_data.text, 'lxml')
        title = soup.title.text
        price=soup.select('div.infocard__container__item__main > span')[0].text.strip()
        date = soup.select('div.detail-title__info > div:nth-child(1)')[0].text.strip()
        # area = list(soup.select('div.infocard__container__item__main > a')[0].stripped_strings) if soup.find_all('span', 'c_25d') else None
        item_info.insert_one({"title": title, "price": price, "date":date, 'url': url})
        print({"title": title, "price": price, "date": date, 'url': url})
        
        

#get_links_from('https://bj.58.com/shouji/',5)

# get_item_info('https://bj.58.com/shouji/38906156683048x.shtml?link_abtest=&psid=191980321205002019964782033&entinfo=38906156683048_p&slot=-1')
# get_item_info('https://bj.58.com/huishou/38703741878047x.shtml?adtype=1&adact=3&psid=116742417205002763965142277&iuType=b_1&link_abtest=&ClickID=5&PGTID=0d300024-0000-11ee-7cb0-3b96abcda5a8&slot=1000106')
# get_item_info('https://bj.58.com/shouji/32235767232184x.shtml?link_abtest=&psid=116742417205002763965142277&entinfo=32235767232184_j&slot=-1&iuType=j_2&PGTID=0d300024-0000-11ee-7cb0-3b96abcda5a8&ClickID=7')
