package com.example.wasserkanne

class Datasource {
    fun loadkannen() :List<Kanne> {
        return listOf(
            Kanne("Kanne Blue Stone", 200.0, R.drawable.can1 ),
            Kanne("Kanne Green Weed", 250.0, R.drawable.can2 ),
            Kanne("Kanne Red Periods", 2050.0, R.drawable.can3 ),
            Kanne("Kanne Grey Death", 2.0, R.drawable.can4 ),
            Kanne("Kanne Silver Long", 5000.0, R.drawable.can5 ),


        )

    }
}