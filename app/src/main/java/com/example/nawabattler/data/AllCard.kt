package com.example.nawabattler.data

import com.example.nawabattler.structure.Card
import com.example.nawabattler.R

// 全てのカードの効果と画像が入っている(どこからでもアクセス可能)
val AllCard = arrayOf(
    Card(
        R.drawable.palagon,
        arrayOf(
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 1, 0, 1, 0),
            intArrayOf(1, 0, 0, 0, 1),
            intArrayOf(0, 1, 0, 1, 0),
            intArrayOf(0, 0, 1, 0, 0)
        )
    ),
    Card(
        R.drawable.parasol,
        arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 1, 1, 1, 0),
            intArrayOf(1, 0, 1, 0, 1),
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 1, 0, 0, 0)
        )
    ),
    Card(
        R.drawable.boomerang,
        arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 1, 0),
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 0, 0, 1, 0),
            intArrayOf(0, 0, 0, 0, 0)
        )
    ),
    Card(
        R.drawable.monument,
        arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 1, 0),
            intArrayOf(0, 0, 1, 1, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0)
        )
    ),
    Card(
        R.drawable.lifle,
        arrayOf(
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 0, 1, 1, 0),
            intArrayOf(0, 1, 1, 0, 0)
        )
    ),
    Card(
        R.drawable.scythe,
        arrayOf(
            intArrayOf(0, 0, 1, 1, 0),
            intArrayOf(0, 1, 0, 1, 1),
            intArrayOf(0, 1, 0, 0, 1),
            intArrayOf(0, 1, 0, 0, 0),
            intArrayOf(0, 1, 0, 0, 0)
        )
    ),
    Card(
        R.drawable.bomb,
        arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 1, 1, 1, 0),
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 0, 0, 0, 0)
        )
    ),
    Card(
        R.drawable.wave,
        arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 1, 1, 1, 1),
            intArrayOf(1, 0, 1, 1, 0),
            intArrayOf(0, 0, 0, 0, 0)
        )
    ),
    Card(
        R.drawable.thunder,
        arrayOf(
            intArrayOf(0, 0, 0, 1, 0),
            intArrayOf(0, 0, 0, 1, 0),
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 1, 1, 0, 0),
            intArrayOf(0, 0, 1, 0, 0)
        )
    ),
    Card(
        R.drawable.ghost,
        arrayOf(
            intArrayOf(0, 1, 0, 1, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 0, 1, 0, 0)
        )
    ),
    Card(
        R.drawable.firework,
        arrayOf(
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 1, 0, 1, 0),
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 0, 0)
        )
    ),
    Card(
        R.drawable.shuriken,
        arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 1, 0),
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 1, 1, 0, 0),
            intArrayOf(0, 0, 0, 0, 0)
        )
    ),
    Card(
        R.drawable.scissors,
        arrayOf(
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 1, 0, 1, 1),
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 0, 0, 0, 0)
        )
    ),
    Card(
        R.drawable.fountainpen,
        arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 1, 0),
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0)
        )
    ),
    Card(
        R.drawable.barrier,
        arrayOf(
            intArrayOf(0, 1, 1, 0, 0),
            intArrayOf(1, 0, 0, 1, 0),
            intArrayOf(1, 0, 0, 1, 0),
            intArrayOf(0, 1, 1, 0, 0),
            intArrayOf(0, 0, 0, 0, 0)
        )
    ),
    Card(
        R.drawable.pinwheel,
        arrayOf(
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(1, 1, 1, 0, 0),
            intArrayOf(0, 1, 1, 1, 0),
            intArrayOf(0, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0)
        )
    ),
)
