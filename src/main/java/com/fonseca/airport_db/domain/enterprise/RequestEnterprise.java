package com.fonseca.airport_db.domain.enterprise;

import org.jetbrains.annotations.NotNull;

public record RequestEnterprise(@NotNull
                                Integer enterpriseID,

                                @NotNull
                                String name){
}