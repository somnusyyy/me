# -*- coding=utf-8 -*-

import argparse
from PIL import Image

parser = argparse.ArgumentParser()
parser.add_argument('file')
parser.add_argument('-o', '--output')
parser.add_argument('--width', type=int, default=80)
parser.add_argument('--length', type=int, default=80)

args = parser.parse_args()

Img = args.file
Width = args.width
Length = args.length
Output = args.output

ascii_char = list("$@B%8&WM#*oahkbdpqwmZO0QLCJUYXzcvunxrjft/\|()1{}[]?-_+~<>i!lI;:,\"^`'. ")


def get_char(gray, alpha=256):
    gray = int(0.2126 * r + 0.7152 * g + 0.0722 * b)
    unit = (256.0 + 1) / 70
    return ascii_char[int(gray / unit)]


if __name__ == '__main__':
    img = Image.open(Img)
    img.resize((Width, Length), Image.NEAREST)

    txt = ""

    for i in range(Length):
        for j in range(Width):
            txt += get_char(img.getpixel((i, j)))
        txt += "\n"

    print(txt)
    if Output:
        with open(Output, 'w') as f:
            f.write(txt)
    else:
        with open("output.txt", 'w') as f:
            f.write(txt)
