package com.nickyrabit.starbucks

import androidx.compose.Composable
import androidx.ui.core.*
import androidx.ui.foundation.ColoredRect
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.shape.DrawShape
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Card
import androidx.ui.material.withOpacity
import androidx.ui.text.TextStyle
import androidx.ui.text.font.Font
import androidx.ui.text.font.FontFamily
import androidx.ui.text.font.FontWeight
import androidx.ui.tooling.preview.Preview
import com.nickyrabit.starbucks.images.*


@Composable
fun CoffeeDashboard() {
    Padding(left = 10.dp,top = 10.dp) {
        VerticalScroller() {
            Column {

                TitleBar()
                HeightSpacer(height = 30.dp)
                DashboardSummary()
                HeightSpacer(height = 30.dp)
                PopularCoffee()
                Padding(left = 8.dp){
                    VerticalScroller() {
                        FoodDivider()
                    }


                }

            }
        }
    }

}


@Preview
@Composable
fun FoodDivider() {
    MaterialTheme() {

        Column(){


            Container(){
                Row(mainAxisAlignment = MainAxisAlignment.SpaceBetween,
                    mainAxisSize = LayoutSize.Expand) {

                    Text(text = "Food", style = TextStyle(fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold")), fontSize = 19.sp
                    )
                    )
                    Padding(padding = EdgeInsets(top = 4.dp,right = 10.dp)) {
                        Text("See All",style = TextStyle(fontSize = 13.sp).withOpacity(0.4f))

                    }
                }
            }
            HeightSpacer(height = 15.dp)


            Row(mainAxisSize = LayoutSize.Expand,mainAxisAlignment = MainAxisAlignment.SpaceBetween){

                Container(height = 50.dp,width = 70.dp) {
                    Clip(shape = RoundedCornerShape(topRight = 8.dp,topLeft = 8.dp,bottomRight = 8.dp,bottomLeft = 8.dp)) {
                        DrawImage(image = foodOne)
                    }
                }
                Column() {
                    Text("Honey BBQ Chicken",style = TextStyle(fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))))
                    HeightSpacer(height = 5.dp)
                    Row{
                        Opacity(opacity = 0.30f , children = {
                            Card(color = Color.Gray,shape = RoundedCornerShape(8.dp)) {

                                Container(height = 22.dp,width = 80.dp) {
                                    Column() {
                                        Text(text = "8 min",style = TextStyle(fontWeight = FontWeight.Bold
                                        )
                                        )


                                    }
                                }
                            }
                        })
                        WidthSpacer(width = 5.dp)
                        Opacity(opacity = 0.30f , children = {
                            Card(color = Color.Gray,shape = RoundedCornerShape(8.dp)) {

                                Container(height = 22.dp,width = 80.dp) {
                                    Column() {
                                        Text(text = "370 kcal",style = TextStyle(fontWeight = FontWeight.Bold                    ))


                                    }
                                }
                            }
                        })

                    }

                }
                Padding(right = 10.dp){
                    Text(text = "$13",style = TextStyle(fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))))
                }




            }
            HeightSpacer(height = 15.dp)
            Row(mainAxisSize = LayoutSize.Expand,mainAxisAlignment = MainAxisAlignment.SpaceBetween){

                Container(height = 50.dp,width = 70.dp) {
                    Clip(shape = RoundedCornerShape(topRight = 8.dp,topLeft = 8.dp,bottomRight = 8.dp,bottomLeft = 8.dp)) {
                        DrawImage(image = foodTwo)
                    }
                }
                Column() {
                    Text("Honey BBQ Crunchy",style = TextStyle(fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))))
                    HeightSpacer(height = 5.dp)
                    Row{
                        Opacity(opacity = 0.30f , children = {
                            Card(color = Color.Gray,shape = RoundedCornerShape(8.dp)) {

                                Container(height = 22.dp,width = 80.dp) {
                                    Column() {
                                        Text(text = "8 min",style = TextStyle(fontWeight = FontWeight.Bold
                                        )
                                        )


                                    }
                                }
                            }
                        })
                        WidthSpacer(width = 5.dp)
                        Opacity(opacity = 0.30f , children = {
                            Card(color = Color.Gray,shape = RoundedCornerShape(8.dp)) {

                                Container(height = 22.dp,width = 80.dp) {
                                    Column() {
                                        Text(text = "370 kcal",style = TextStyle(fontWeight = FontWeight.Bold                    ))


                                    }
                                }
                            }
                        })

                    }

                }

                Padding(right = 10.dp){
                    Text(text = "$35",style = TextStyle(fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))))
                }


            }
            HeightSpacer(height = 15.dp)
            Row(mainAxisSize = LayoutSize.Expand,mainAxisAlignment = MainAxisAlignment.SpaceBetween){

                Container(height = 50.dp,width = 70.dp) {
                    Clip(shape = RoundedCornerShape(topRight = 8.dp,topLeft = 8.dp,bottomRight = 8.dp,bottomLeft = 8.dp)) {
                        DrawImage(image = foodThree)
                    }
                }
                Column() {
                    Text("Sunrise Cappucino",style = TextStyle(fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))))
                    HeightSpacer(height = 5.dp)
                    Row{
                        Opacity(opacity = 0.30f , children = {
                            Card(color = Color.Gray,shape = RoundedCornerShape(8.dp)) {

                                Container(height = 22.dp,width = 80.dp) {
                                    Column() {
                                        Text(text = "8 min",style = TextStyle(fontWeight = FontWeight.Bold
                                        )
                                        )


                                    }
                                }
                            }
                        })
                        WidthSpacer(width = 5.dp)
                        Opacity(opacity = 0.30f , children = {
                            Card(color = Color.Gray,shape = RoundedCornerShape(8.dp)) {

                                Container(height = 22.dp,width = 80.dp) {
                                    Column() {
                                        Text(text = "370 kcal",style = TextStyle(fontWeight = FontWeight.Bold                    ))


                                    }
                                }
                            }
                        })

                    }

                }

                Padding(right = 10.dp){
                    Text(text = "$24",style = TextStyle(fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))))
                }


            }



        }


    }
}


@Composable
fun PopularCoffee(){

    MaterialTheme() {
        Container(padding = EdgeInsets(left = 10.dp,right = 10.dp)){
            Row(mainAxisAlignment = MainAxisAlignment.SpaceBetween,
                mainAxisSize = LayoutSize.Expand) {

                Text(text = "Popular Coffee", style = TextStyle(fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold")), fontSize = 19.sp
                )
                )
                Padding(padding = EdgeInsets(top = 4.dp)) {
                    Text("See All",style = TextStyle(fontSize = 13.sp).withOpacity(0.4f))

                }

            }
        }
        HeightSpacer(height = 15.dp)
        Padding(top = 10.dp){
            HorizontalScroller() {
                Row() {
                    Padding(left = 10.dp,bottom = 40.dp) {
                        Card(elevation = 10.dp,shape = RoundedCornerShape(8.dp)) {
                            Container(width = 130.dp) {


                                Column() {
                                    Container(height = 180.dp, width = 130.dp) {
                                        Clip(
                                            shape = RoundedCornerShape(
                                                topRight = 8.dp,
                                                topLeft = 8.dp
                                            )
                                        ) {

                                            DrawImage(image = brew_two)

                                        }


                                    }
                                    Padding(left = 10.dp){
                                        Column() {


                                            Text(
                                                text = "Cold Brew",
                                                style = TextStyle(
                                                    fontWeight = FontWeight.Bold,
                                                    fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))
                                                ).withOpacity(0.87f)
                                            )

                                            Text(
                                                text = "Calories - 200",
                                                style = TextStyle(fontSize = 12.sp,
                                                    fontWeight = FontWeight.Bold,
                                                    fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))
                                                ).withOpacity(0.4f)
                                            )
                                            HeightSpacer(height = 10.dp)
                                            ColoredRect(
                                                color = Color.Gray,
                                                width = 130.dp,
                                                height = 1.dp
                                            )
                                            HeightSpacer(height = 10.dp)
                                            Row(
                                                mainAxisSize = LayoutSize.Expand,
                                                mainAxisAlignment = MainAxisAlignment.SpaceBetween
                                            ) {

                                                Text(
                                                    text = "$14",
                                                    style = TextStyle(
                                                        fontWeight = FontWeight.Bold,
                                                        fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))
                                                    ).withOpacity(0.87f)
                                                )
                                                Padding(right=15.dp){
                                                    Text(
                                                        text = "+",
                                                        style = TextStyle(
                                                            fontSize = 20.sp,
                                                            fontWeight = FontWeight.Bold,
                                                            fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))
                                                        ).withOpacity(0.87f)
                                                    )
                                                }

                                            }
                                        }
                                    }
                                    HeightSpacer(height = 10.dp)

                                }
                            }
                        }
                    }
                    Padding(left = 10.dp) {

                        Card(elevation = 10.dp,shape = RoundedCornerShape(8.dp)) {

                            Container(width = 130.dp) {
                                Column() {
                                    Container(height = 180.dp,width = 130.dp) {
                                        Clip(shape = RoundedCornerShape(topRight = 8.dp,topLeft = 8.dp)) {
                                            DrawImage(image = brew_one)
                                        }
                                    }
                                    Padding(left = 10.dp){
                                        Column() {
                                            Text(text = "Cold Brew",style = TextStyle(fontWeight = FontWeight.Bold,fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))).withOpacity(0.87f))

                                            Text(text = "Calories - 200",style = TextStyle(fontWeight = FontWeight.Bold,fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))).withOpacity(0.4f))
                                            HeightSpacer(height = 8.dp)
                                            ColoredRect(color = Color.Gray,width = 130.dp, height = 1.dp)
                                            HeightSpacer(height = 10.dp)
                                            Row(mainAxisSize = LayoutSize.Expand,mainAxisAlignment = MainAxisAlignment.SpaceBetween) {

                                                Text(text = "$20",style = TextStyle(fontWeight = FontWeight.Bold,fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))).withOpacity(0.87f))
                                                Padding(right=15.dp){
                                                    Text(
                                                        text = "+",
                                                        style = TextStyle(
                                                            fontSize = 20.sp,
                                                            fontWeight = FontWeight.Bold,
                                                            fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))
                                                        ).withOpacity(0.87f)
                                                    )
                                                }
                                            }
                                        }
                                    }
                                    HeightSpacer(height = 10.dp)






                                }


                            }
                        }

                    }
                    Padding(left = 10.dp) {
                        Card(elevation = 10.dp,shape = RoundedCornerShape(8.dp)) {
                            Container(width = 130.dp) {


                                Column(mainAxisSize = LayoutSize.Wrap) {
                                    Container(height = 180.dp, width = 130.dp) {
                                        Clip(
                                            shape = RoundedCornerShape(
                                                topRight = 8.dp,
                                                topLeft = 8.dp
                                            )
                                        ) {

                                            DrawImage(image = brew_two)

                                        }


                                    }
                                    Padding(left = 10.dp){
                                        Column() {


                                            Text(
                                                text = "Cold Brew",
                                                style = TextStyle(
                                                    fontWeight = FontWeight.Bold,
                                                    fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))
                                                ).withOpacity(0.87f)
                                            )

                                            Text(
                                                text = "Calories - 200",
                                                style = TextStyle(
                                                    fontWeight = FontWeight.Bold,
                                                    fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))
                                                ).withOpacity(0.4f)
                                            )
                                            HeightSpacer(height = 8.dp)
                                            ColoredRect(
                                                color = Color.Gray,
                                                width = 130.dp,
                                                height = 1.dp
                                            )
                                            HeightSpacer(height = 10.dp)
                                            Row(
                                                mainAxisSize = LayoutSize.Expand,
                                                mainAxisAlignment = MainAxisAlignment.SpaceBetween
                                            ) {

                                                Text(
                                                    text = "$13",
                                                    style = TextStyle(
                                                        fontWeight = FontWeight.Bold,
                                                        fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))
                                                    ).withOpacity(0.87f)
                                                )
                                                Padding(right=15.dp){
                                                    Text(
                                                        text = "+",
                                                        style = TextStyle(
                                                            fontSize = 20.sp,
                                                            fontWeight = FontWeight.Bold,
                                                            fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))
                                                        ).withOpacity(0.87f)
                                                    )
                                                }

                                            }
                                        }
                                    }
                                    HeightSpacer(height = 10.dp)

                                }
                            }
                        }
                    }
                }
            }





        }
    }
}

@Composable
fun DashboardSummary(){
    MaterialTheme() {
        HorizontalScroller() {
            Row() {
                Padding(left = 10.dp) {
                    Card(color = Color(red=32, green = 151,blue =64 ),shape = RoundedCornerShape(8.dp),elevation = 10.dp) {

                        Container(height = 60.dp,width = 140.dp) {
                            Column(mainAxisAlignment = MainAxisAlignment.Start) {
                                Text(text = "99+",style = TextStyle(color = Color.White,
                                    fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))
                                )
                                )
                                Text(text = "All Products",style = TextStyle(color = Color.White,
                                    fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))
                                )
                                )

                            }
                        }
                    }

                }
                Padding(left = 10.dp,bottom = 10.dp) {
                    Opacity(opacity = 0.30f , children = {
                        Card(color = Color.Gray,shape = RoundedCornerShape(8.dp),elevation = 10.dp) {

                            Container(height = 60.dp,width = 140.dp) {
                                Column() {

                                    Text(text = "23",style = TextStyle(fontWeight = FontWeight.Bold,fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))))
                                    Text(text = "Food            ",style = TextStyle(
                                        fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))
                                    )
                                    )


                                }
                            }
                        }
                    })

                }
                Padding(left = 10.dp,bottom = 10.dp) {
                    Opacity(opacity = 0.30f , children = {
                        Card(color = Color.Gray,shape = RoundedCornerShape(8.dp),elevation = 10.dp) {

                            Container(height = 60.dp,width = 140.dp) {
                                Column() {
                                    Text(text = "48",style = TextStyle(fontWeight = FontWeight.Bold,fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))))
                                    Text(text = "Coffees        ",style = TextStyle(
                                        fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold"))
                                    )
                                    )


                                }
                            }
                        }
                    })
                }



            }
        }

    }
}

@Composable
fun TitleBar(){

    MaterialTheme() {
        Row(
            mainAxisSize = LayoutSize.Expand,
            modifier = Spacing(10.dp),
            mainAxisAlignment = MainAxisAlignment.SpaceBetween


        ) {
            Text(
                text = "Starbucks Coffee",
                style = TextStyle(
                    fontFamily = FontFamily(font = Font(name = "montserrat_alternates_semibold")),
                    fontSize = 19.sp
                )
            )

            Container(
                width = 45.dp,
                height = 45.dp
            ) {
                Stack(block = {
                    DrawShape(shape = CircleShape, color = Color(red=32, green = 151,blue =64 ))


                    Container(width = 22.dp,height = 22.dp){
                        DrawImage(image = image)

                    }


                })

            }

        }
    }
}