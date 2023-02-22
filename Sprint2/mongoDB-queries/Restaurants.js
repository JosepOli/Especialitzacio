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
db.Restaurants.find({$and:[{ cuisine: { $ne: "American " } }, {"grades.score":{$gt:70}}, {"address.coord":{$lt:-65.754168}}]})
db.Restaurants.find({cuisine: { $ne: "American " } , "grades.score":{$gt:70}, "address.coord":{$lt:-65.754168}})
db.Restaurants.find({$and:[{cuisine: { $ne: "American " } }, {"grades.grade": 'A'}, {borough:{ $ne: 'Brooklyn'}}]}).sort("cuisine")
db.Restaurants.find({"name": { $regex: /^Wil/}}, {"restaurant_id": 1, "name": 1, "borough": 1, "cuisine": 1}) // Not working
db.Restaurants.find({"name": { $regex: /ces$/}}, {"restaurant_id": 1, "name": 1, "borough": 1, "cuisine": 1})

 