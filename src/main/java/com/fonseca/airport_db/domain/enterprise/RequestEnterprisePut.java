package com.fonseca.airport_db.domain.enterprise;

import org.jetbrains.annotations.NotNull;

public record RequestEnterprisePut(@NotNull
                                   Integer enterpriseID,

                                   String name){
}