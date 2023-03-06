db.Restaurants.find()
db.Restaurants.find({}, {restaurant_id:1, name:1, borough:1, cuisine:1})
db.Restaurants.find({}, {restaurant_id:1, name:1, borough:1, cuisine:1, _id:0})
db.Restaurants.find({}, {restaurant_id:1, name:1, borough:1, address:{zipcode:1}, _id:0})
db.Restaurants.find({borough:'Bronx'}, {})
db.Restaurants.find({borough:'Bronx'}, {}).limit(5)
db.Restaurants.find({borough:'Bronx'}, {}).skip(5).limit(5)
db.Restaurants.find({"grades.score":{$gt:90}})
db.Restaurants.find({"grades.score":{$gt:80, $lt:100}})
db.Restaurants.find({"address.coord":{$lt:-95.754168}})
db.Restaurants.find({$and:[{cuisine: {$ne:"American "}}, {"grades.score":{$gt:70}}, {"address.coord":{$lt:-65.754168}}]})
db.Restaurants.find({cuisine: {$ne: "American "}, "grades.score":{$gt:70}, "address.coord":{$lt:-65.754168}})
db.Restaurants.find({$and:[{cuisine: {$ne:"American "}}, {"grades.grade":'A'}, {borough:{ $ne: 'Brooklyn'}}]}).sort("cuisine")
db.Restaurants.find({"name": {$regex: /^Wil/}}, {"restaurant_id":1, "name":1, "borough":1, "cuisine":1})
db.Restaurants.find({"name": {$regex: /ces$/}}, {"restaurant_id":1, "name":1, "borough":1, "cuisine":1})
db.Restaurants.find({"name": {$regex: /Reg/}}, {"restaurant_id":1, "name":1, "borough":1, "cuisine":1})
db.Restaurants.find({"borough": "Bronx", "cuisine": {$in: ["American", "Chinese"]}})
db.Restaurants.find({"borough": {$in: ["Staten Island", "Queens", "Bronx", "Brooklyn"]}}, {"restaurant_id":1, "name":1, "borough":1, "cuisine":1})
db.Restaurants.find({"borough": {$nin: ["Staten Island", "Queens", "Bronx", "Brooklyn"]}}, {"restaurant_id":1, "name":1, "borough":1, "cuisine":1})
db.Restaurants.find({"grades.score": {$lte:10}}, {"restaurant_id":1,"name":1, "borough":1, "cuisine":1})
db.Restaurants.find({$or: [{"cuisine": "Seafood", "cuisine":{$ne:"American"}, "cuisine":{$ne:"Chinese"}}, {"name":{$regex:/^Wil/}}]}, {"restaurant_id": 1, "name": 1, "borough": 1, "cuisine": 1 })
db.Restaurants.find({"grades.grade": "A", "grades.score": 11, "grades.date": ISODate("2014-08-11T00:00:00Z")}, {"restaurant_id": 1, "name": 1, "grades": 1})
db.Restaurants.find({"grades.1.grade": "A", "grades.1.score": 9, "grades.1.date": ISODate("2014-08-11T00:00:00Z")}, {"restaurant_id": 1, "name": 1, "grades": 1})
db.Restaurants.find({"address.coord.1": {$gt: 42, $lte: 52}}, {"restaurant_id": 1, "name": 1, "address": 1, "location": 1})
db.Restaurants.find().sort({"name": 1})
db.Restaurants.find().sort({"name": -1})
db.Restaurants.find().sort({"cuisine": 1, "borough": -1})
db.Restaurants.find({"address.street": {$exists: true, $ne: ""}}).count() == db.restaurants.find().count()
db.Restaurants.find({"address.coord": {$type: "double"}})
db.Restaurants.find({"grades.score": {$mod: [ 7, 0 ]}}, {"restaurant_id": 1, "name": 1, "grades.grade": 1})
db.Restaurants.find({"name": { $regex: /mon/i}}, {"name": 1, "borough": 1, "address.coord": 1, "cuisine": 1})
db.Restaurants.find({"name": { $regex: /^Mad/i}}, {"name": 1, "borough": 1, "address.coord": 1, "cuisine": 1}) 