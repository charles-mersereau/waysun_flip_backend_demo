package com.waysuninc.flipbackendapi.entities

import kotlinx.serialization.Serializable


@Serializable
data class User(val name: String, val order: Int) {

//    @Serializer(forClass = User::class)
//    object UserSerializer : KSerializer<User> {
//
//        override val descriptor: SerialDescriptor
//            get() = SerialDescriptor("UserSerializer")
//
//        override fun deserialize(decoder: Decoder): User = decoder.decodeString().run { User }
//
//        override fun serialize(encoder: Encoder, value: User) {
//            encoder.encodeString(value::class.qualifiedName!!)
//        }
//    }

}

