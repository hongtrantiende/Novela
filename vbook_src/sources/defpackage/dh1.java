package defpackage;

import java.io.Serializable;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dh1  reason: default package */
/* loaded from: classes3.dex */
public abstract class dh1 {
    public static final Map a = o17.s(new yk8('1', 1), new yk8((char) 19968, 1), new yk8((char) 22777, 1), new yk8('2', 2), new yk8((char) 20108, 2), new yk8((char) 36019, 2), new yk8((char) 36014, 2), new yk8((char) 36144, 1), new yk8((char) 20841, 2), new yk8((char) 20004, 2), new yk8('3', 3), new yk8((char) 19977, 3), new yk8((char) 21441, 3), new yk8((char) 21443, 3), new yk8((char) 21444, 3), new yk8((char) 21442, 3), new yk8('4', 4), new yk8((char) 22235, 4), new yk8((char) 32902, 4), new yk8('5', 5), new yk8((char) 20116, 5), new yk8((char) 20237, 5), new yk8('6', 6), new yk8((char) 20845, 6), new yk8((char) 38520, 6), new yk8((char) 38470, 6), new yk8('7', 7), new yk8((char) 19971, 7), new yk8((char) 26578, 7), new yk8('8', 8), new yk8((char) 20843, 8), new yk8((char) 25420, 8), new yk8('9', 9), new yk8((char) 20061, 9), new yk8((char) 29590, 9), new yk8('0', 0), new yk8((char) 38646, 0), new yk8((char) 12295, 0));
    public static final Map b = o17.s(new yk8((char) 24319, "二十"), new yk8((char) 24565, "二十"), new yk8((char) 21317, "三十"), new yk8((char) 21324, "四十"), new yk8((char) 22313, "五十"), new yk8((char) 22291, "六十"), new yk8((char) 22278, "六十"), new yk8((char) 36914, "七十"), new yk8((char) 36827, "七十"), new yk8((char) 26543, "八十"), new yk8((char) 27194, "九十"), new yk8((char) 26726, "九十"), new yk8((char) 30357, "兩百"));
    public static final Map c = o17.s(new yk8((char) 21313, 10), new yk8((char) 25342, 10), new yk8((char) 30334, 100), new yk8((char) 20336, 100), new yk8((char) 21315, 1000), new yk8((char) 20191, 1000));
    public static final Map d = o17.s(new yk8((char) 33836, 10000), new yk8((char) 19975, 10000), new yk8((char) 20740, 100000000), new yk8((char) 20159, 100000000));

    public static int a(String str) {
        int intValue;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            Object obj = (String) b.get(Character.valueOf(charAt));
            if (obj == null) {
                obj = Character.valueOf(charAt);
            }
            sb.append(obj);
        }
        String sb2 = sb.toString();
        int length = sb2.length();
        int length2 = sb2.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length2; i5++) {
            char charAt2 = sb2.charAt(i5);
            Character valueOf = Character.valueOf(charAt2);
            Map map = a;
            if (map.containsKey(valueOf)) {
                Object obj2 = map.get(Character.valueOf(charAt2));
                obj2.getClass();
                int intValue2 = ((Number) obj2).intValue() + i3;
                int i6 = length - 1;
                if (i5 == i6 && length >= 2) {
                    int i7 = i5 - 1;
                    if (sb2.charAt(i7) == 30334 || sb2.charAt(i7) == 20336) {
                        intValue2 *= 10;
                    }
                }
                if (i5 == i6 && length >= 2) {
                    int i8 = i5 - 1;
                    if (sb2.charAt(i8) == 21315 || sb2.charAt(i8) == 20191) {
                        intValue2 *= 100;
                    }
                }
                if (i5 == i6 && length >= 2) {
                    int i9 = i5 - 1;
                    if (sb2.charAt(i9) == 33836 || sb2.charAt(i9) == 19975) {
                        i3 = intValue2 * 1000;
                    }
                }
                i3 = intValue2;
            }
            Character valueOf2 = Character.valueOf(charAt2);
            Map map2 = c;
            if (map2.containsKey(valueOf2)) {
                if (i3 == 0) {
                    Object obj3 = map2.get(Character.valueOf(charAt2));
                    obj3.getClass();
                    intValue = ((Number) obj3).intValue();
                } else {
                    Object obj4 = map2.get(Character.valueOf(charAt2));
                    obj4.getClass();
                    intValue = i3 * ((Number) obj4).intValue();
                }
                i2 += intValue;
                i3 = 0;
            }
            Character valueOf3 = Character.valueOf(charAt2);
            Map map3 = d;
            if (map3.containsKey(valueOf3)) {
                int i10 = i2 + i3;
                Object obj5 = map3.get(Character.valueOf(charAt2));
                obj5.getClass();
                i4 += ((Number) obj5).intValue() * i10;
                i2 = 0;
                i3 = 0;
            }
        }
        return i2 + i3 + i4;
    }

    public static Serializable b(String str) {
        Serializable gs9Var;
        str.getClass();
        try {
            Integer R = r4b.R(10, str);
            if (R == null || (gs9Var = String.valueOf(R.intValue())) == null) {
                gs9Var = Integer.valueOf(a(str));
            }
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        if (gs9Var instanceof gs9) {
            return null;
        }
        return gs9Var;
    }
}
