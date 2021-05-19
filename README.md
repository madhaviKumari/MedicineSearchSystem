# API Doc

## Upload CSV to DB 

Resource Path : /api/master/uploadCSV<br/>
Method : POST<br/>
Form-Data:

```
file:multipart-file

```
Response :

```
success/error message
```
Note : Currently this API is supporting XLSX, Had some issue with CSV read in my system. [See XLSX converted file here](Productlist.xlsx)     <br/>


## Search Medicine By Name
Resource Path : /api/master/searchMedicine<br/>
Method : GET<br/>
Params

```
q=search_string
```

e.g: /api/master/searchMedicine?q=STATOR<br/>
Response result:

```
{
    "message": "result for STATOR",
    "data": [
        "STATOR CV 10MG TAB",
        "STATOR CV 20MG TAB",
        "STATOR 10MG (15'S)",
        "STATOR 40 MG 15'S TAB",
        "STATOR 20MG TAB(15'S)",
        "STATOR F  TAB 15'S",
        "STATOR ASP 75MG 15'S CAPS"
    ]
}

```
## Get Medicine by Id
Resource Path : /api/master/getMedicineDetails<br/>
Method : GET<br/>
Params

```
id=c_unique_id
```
e.g /api/master/getMedicineDetails?id=661294 <br/>
Response Data:

```
{
    "cUniqueCode": "661294",
    "cname": "STATOR ASP 75MG 15'S CAPS",
    "c_batch_no": "ADF0315",
    "d_expiry_date": "1/9/2022",
    "n_balance_qty": 30.0,
    "c_packaging": "15'S",
    "c_schemes": 0.0,
    "n_mrp": 60.42,
    "c_manufacturer": "ABBOTT HEALTH CARE-CARDIAC",
    "hsn_code": 3.0042019E7
}
```
## Place Order
Resource Path : /api/master/placeorder<br/>
Method : POST<br/>
Request JSON:

```
{
    "c_unique_id":"661294",
    "quntity":10
}
```

Response Data:

```
{
    "id": "60a427ee0456e260c83c8fc7"
}

```