Feature: boutique page

Scenario: effectuer le tri et cliquer sur un produit

Given utilisateur est sur la page boutique 
When utilsateur effectue le tri1 "ASC" lle tri2 "Name" et le tri3 "Accessoires"
And clique sur le produit "Mi 20W Wireless Charging Stand"
Then utilisateur est derige vers la page du produit "Mi 20W Wireless Charging Stand"