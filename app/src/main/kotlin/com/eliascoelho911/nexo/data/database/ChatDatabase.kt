package com.eliascoelho911.nexo.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.eliascoelho911.nexo.data.database.dao.ChatRoomDao
import com.eliascoelho911.nexo.data.database.dao.MessageDao
import com.eliascoelho911.nexo.data.database.entity.APITypeConverter
import com.eliascoelho911.nexo.data.database.entity.ChatRoom
import com.eliascoelho911.nexo.data.database.entity.Message

@Database(entities = [ChatRoom::class, Message::class], version = 1)
@TypeConverters(APITypeConverter::class)
abstract class ChatDatabase : RoomDatabase() {

    abstract fun chatRoomDao(): ChatRoomDao
    abstract fun messageDao(): MessageDao
}
