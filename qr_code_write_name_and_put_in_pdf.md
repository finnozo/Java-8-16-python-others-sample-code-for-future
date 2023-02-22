```python


import csv
from PIL import Image, ImageFont, ImageDraw
import qrcode
from fpdf import FPDF
import glob

with open('/Users/technoboost/Documents/ImportaintFiles/python/qr_file.csv') as csv_file:
    csvFile = csv.reader(csv_file)
    for row in csvFile:
        print(row[0])
        img=qrcode.make(str(row[0]))
        img.save('qr_'+str(row[0])+'.png')
        my_image = Image.open('qr_'+str(row[0])+'.png')
        title_font = ImageFont.truetype('/Users/technoboost/Documents/ImportaintFiles/python/arial-black.ttf', 35)
        title_text = str(row[0])
        image_editable = ImageDraw.Draw(my_image)
        image_editable.text((35,247), title_text, (000), font=title_font)
        my_image.save('qr_'+str(row[0])+'.png')



pdf = FPDF()
pdf.add_page()
files = glob.glob("*")
i = 1
j = 0
x = 0
y = 0
for f in files:
    if i % 81==0:
        pdf.add_page()
        x=0
        y=0
        i=1
        j=0
    if j==8:
        j = 0
        x = 0
        y = y + 30
    pdf.image(f,x,y,25,25)
    j = j + 1
    i = i + 1
    x = x + 25


pdf.output("qr_pdf_file.pdf", "F")



```
### Libery to be install
```cmd
  pip install fpdf
  pip install pillow
  pip install qrcode
  pip install glob2
```
