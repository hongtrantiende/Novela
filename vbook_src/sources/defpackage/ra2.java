package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ra2  reason: default package */
/* loaded from: classes.dex */
public final class ra2 {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final al5 b;
    public final vw c;
    public final s26 d;
    public final tc0 e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        s21.u(5, hashMap, "armeabi", 6, "armeabi-v7a");
        s21.u(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.0.6";
    }

    public ra2(Context context, al5 al5Var, vw vwVar, s26 s26Var, tc0 tc0Var) {
        this.a = context;
        this.b = al5Var;
        this.c = vwVar;
        this.d = s26Var;
        this.e = tc0Var;
    }

    public static qb0 c(oaa oaaVar, int i) {
        qb0 qb0Var;
        String str = (String) oaaVar.c;
        String str2 = (String) oaaVar.b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) oaaVar.d;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        oaa oaaVar2 = (oaa) oaaVar.e;
        if (i >= 8) {
            oaa oaaVar3 = oaaVar2;
            while (oaaVar3 != null) {
                oaaVar3 = (oaa) oaaVar3.e;
                i2++;
            }
        }
        int i3 = i2;
        List d = d(stackTraceElementArr, 4);
        if (d != null) {
            byte b = (byte) (0 | 1);
            if (oaaVar2 != null && i3 == 0) {
                qb0Var = c(oaaVar2, i + 1);
            } else {
                qb0Var = null;
            }
            if (b == 1) {
                return new qb0(str, str2, d, qb0Var, i3);
            }
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" overflowCount");
            }
            vs.k(s21.o("Missing required properties:", sb));
            return null;
        }
        xk5.k("Null frames");
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [tb0, java.lang.Object] */
    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        long j;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            ?? obj = new Object();
            obj.e = i;
            obj.f = (byte) (obj.f | 4);
            long j2 = 0;
            if (stackTraceElement.isNativeMethod()) {
                j = Math.max(stackTraceElement.getLineNumber(), 0L);
            } else {
                j = 0;
            }
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j2 = stackTraceElement.getLineNumber();
            }
            obj.a = j;
            obj.b = str;
            obj.c = fileName;
            obj.d = j2;
            obj.f = (byte) (((byte) (obj.f | 1)) | 2);
            arrayList.add(obj.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static rb0 e() {
        return new rb0(0L, "0", "0");
    }

    public final List a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        vw vwVar = this.c;
        String str = vwVar.e;
        if (str != null) {
            String str2 = vwVar.b;
            if (b == 3) {
                return Collections.singletonList(new pb0(0L, 0L, str, str2));
            }
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((b & 2) == 0) {
                sb.append(" size");
            }
            vs.k(s21.o("Missing required properties:", sb));
            return null;
        }
        xk5.k("Null name");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Type inference failed for: r1v9, types: [xb0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yb0 b(int r17) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra2.b(int):yb0");
    }
}
