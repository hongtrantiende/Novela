package defpackage;

import java.util.Locale;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vk1  reason: default package */
/* loaded from: classes.dex */
public abstract class vk1 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final Pattern c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        char c2;
        String str = b[i];
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i3);
        if (z) {
            c2 = 'H';
        } else {
            c2 = 'L';
        }
        Object[] objArr = {str, valueOf, valueOf2, Character.valueOf(c2), Integer.valueOf(i4)};
        String str2 = a2d.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:154:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0606 A[Catch: NumberFormatException -> 0x0610, TRY_LEAVE, TryCatch #7 {NumberFormatException -> 0x0610, blocks: (B:438:0x05b9, B:440:0x05cd, B:451:0x05eb, B:462:0x0606), top: B:707:0x05b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair b(defpackage.vq4 r33) {
        /*
            Method dump skipped, instructions count: 2924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk1.b(vq4):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0167, code lost:
        if (r12.equals("L60") == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair c(java.lang.String r11, java.lang.String[] r12, defpackage.gm1 r13) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk1.c(java.lang.String, java.lang.String[], gm1):android.util.Pair");
    }
}
