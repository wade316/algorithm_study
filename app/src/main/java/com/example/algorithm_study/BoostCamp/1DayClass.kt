package com.example.algorithm_study.BoostCamp

import java.util.HashMap

fun remove(from: String): String {
    val out = from
    return out
}

operator fun String.get(i: Int): Char = this[i]

fun solution(telno: String): List<String> {
    val tel = remove(telno)
    val failure = listOf("전국", "X")
    val map: HashMap<String, String> = hashMapOf(
        "010" to "휴대폰",
        "011" to "휴대폰", "016" to "휴대폰", "017" to "휴대폰", "018" to "휴대폰", "019" to "휴대폰",
        "02" to "서울",
        "031" to "경기", "032" to "인천", "033" to "강원",
        "041" to "충청", "042" to "대전", "044" to "세종",
        "051" to "부산", "052" to "울산", "053" to "대구",
        "054" to "경북", "055" to "경남",
        "061" to "전남", "062" to "광주", "063" to "전북",
        "064" to "제주"
    )

//    if (tel.length > 11 || tel.length < 9) return failure
//    else if (tel[0] != '0') return failure

    val index0 = 0
    val index2 = 2

//    val last0 = tel.length - 4
//    val last3 = tel.length - 1
//
//    val top = tel.substring(index0..index2)
//    val ext = tel.substring(last0..last3)

//    if (tel.length == 11)
//    if (tel.indexOf('-') != -1) { //방법1
    if (tel.contains('-') || tel.length >= 10) {
        val last0 = tel.length - 4
        val last3 = tel.length - 1

        val top1 = tel.substring(0..2)
        val ext1 = tel.substring(last0..last3)
        if (tel[1] == '1') { //핸드폰
            when (tel[2]) {
                '0' -> {
                    return listOf("핸드폰", "010")
                }

                '1' -> {
                    return listOf("핸드폰", "011")
                }

                '6' -> {
                    return listOf("핸드폰", "016")
                }

                '7' -> {
                    return listOf("핸드폰", "017")
                }

                '8' -> {
                    return listOf("핸드폰", "018")
                }

                '9' -> {
                    return listOf("핸드폰", "019")
                }

                else -> {
                    return listOf("확인 불가", "x")
                }
            }
        } else if (tel[1] == '0') { //국제전화
            when (tel[2]) {
                '1' -> {
                    return listOf("국제전화", "001")
                }

                '2' -> {
                    return listOf("국제전화", "002")
                }

                else -> {
                    return listOf("확인 불가", "x")
                }

            }
        } else if (tel[1] == '2') { //서울
            return listOf("서울", "02")

        } else { //서울 외 지역번호
            if (top1[1] == '3') {
                when (top1) {
                    "031" -> {
                        return listOf("경기", "031")
                    }

                    "032" -> {
                        return listOf("인천", "032")
                    }

                    "033" -> {
                        return listOf("강원", "033")
                    }
                }
            } else if (top1[1] == '4') {
                when (top1) {
                    "041" -> {
                        return listOf("충청", "041")
                    }

                    "042" -> {
                        return listOf("대전", "042")
                    }

                    "044" -> {
                        return listOf("세종", "044")
                    }
                }
            } else if (top1[1] == '5') {
                when (top1) {
                    "051" -> {
                        return listOf("부산", "051")
                    }

                    "052" -> {
                        return listOf("울산", "052")
                    }

                    "053" -> {
                        return listOf("대구", "053")
                    }

                    "054" -> {
                        return listOf("경북", "054")
                    }

                    "055" -> {
                        return listOf("경남", "055")
                    }
                }
            } else if (tel[1] == '6') {
                when (top1) {
                    "061" -> {
                        return listOf("전남", "061")
                    }
                    "062" -> {
                        return listOf("광주", "062")
                    }
                    "063" -> {
                        return listOf("전북", "063")
                    }
                    "064" -> {
                        return listOf("제주", "064")
                    }
                }
            }
        }
    }


//    if (tel[1] == '2') {
//        if (tel.length != 10) return listOf("서울", "X")
//        if (ext[0] == ext[1] && ext[1] == ext[2] && ext[2] == ext[3]) return listOf("서울", "X")
//        return listOf("서울", "O")
//    }
//    else if (tel[1] == '1') {
//        if (!map.containsKey(top)) return failure
//        val top2 = tel[2]
//        if (top2 == '0') {
//            if (tel.length == 11 && (tel[3].toString().toIntOrNull() ?: 1) % 2 == 0) {
//                return listOf("휴대폰", "O")
//            }
//            return listOf("휴대폰", "X")
//        }
//        else {
//            return listOf("휴대폰", "X")
//        }
//    }
//    else {
//        val region = map[top] ?: return failure
//        if (tel.length == 10 && tel[3] == '0') {
//            return listOf(region, "X")
//        }
//        else return listOf(region, "O")
//    }
    return failure
}

fun main(args: Array<String>) {
    println(solution("010-123-1234"))
    println(solution("010-2234-1234"))
    println(solution("02-1234-1234"))
    println(solution("0212341111"))
    println(solution("0311237890"))
    println(solution("061-012-7890"))
    println(solution("015-0157899"))
    println(solution("042-2123-7890"))
    println(solution("001-042-2123-7890"))
    println(solution("002042-2123-7890"))
    println(solution("019-1234-1234"))
    println(solution("01812341234"))
    println(solution("00101812341234"))
}
