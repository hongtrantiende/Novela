package defpackage;

import j$.util.DesugarTimeZone;
import java.util.TimeZone;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pi2  reason: default package */
/* loaded from: classes3.dex */
public abstract class pi2 {
    public static final TimeZone a = DesugarTimeZone.getTimeZone("GMT");
    public static final int[] b = {0, 31, 59, 90, 120, Token.TYPEOFNAME, Token.TEMPLATE_CHARS, 212, 243, 273, 304, 334};
    public static final int[] c = {0, 31, 60, 91, Token.DOT, Token.USE_STACK, Token.TEMPLATE_LITERAL_SUBST, 213, 244, 274, 305, 335};

    public static final jv4 a(Long l) {
        long currentTimeMillis;
        int i;
        int i2;
        int i3;
        int[] iArr;
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        long j = currentTimeMillis;
        long floorDiv = Math.floorDiv(j, 1000L);
        long floorMod = Math.floorMod(floorDiv, 86400L);
        int i4 = (int) (floorMod % 60);
        int i5 = (int) ((floorMod / 60) % 60);
        int i6 = (int) (floorMod / 3600);
        int floorDiv2 = (int) Math.floorDiv(floorDiv, 86400L);
        fid.a.getClass();
        fid fidVar = (fid) fid.c.get(((floorDiv2 % 7) + 10) % 7);
        int i7 = 719468 + floorDiv2;
        if (i7 >= 0) {
            i = i7 / 146097;
            i2 = i7 % 146097;
        } else {
            i = (floorDiv2 + 573372) / 146097;
            i2 = i7 - (146097 * i);
        }
        int i8 = (((i2 / 36524) + (i2 - (i2 / 1460))) - (i2 / 146096)) / 365;
        int i9 = (i * 400) + i8;
        int i10 = i2 - (((i8 / 4) + (i8 * 365)) - (i8 / 100));
        int i11 = ((i10 * 5) + 2) / Token.SETPROP_OP;
        int i12 = (i10 - (((i11 * Token.SETPROP_OP) + 2) / 5)) + 1;
        if (i11 < 10) {
            i3 = i11 + 2;
        } else {
            i3 = i11 - 10;
        }
        if (i3 <= 1) {
            i9++;
        }
        int i13 = i9;
        if (i13 % 4 == 0 && (i13 % 100 != 0 || i13 % 400 == 0)) {
            iArr = c;
        } else {
            iArr = b;
        }
        int i14 = iArr[i3] + i12;
        ar7.b.getClass();
        return new jv4(i4, i5, i6, fidVar, i12, i14, (ar7) ar7.d.get(i3), i13, j);
    }
}
