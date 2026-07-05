package defpackage;

import android.content.Context;
import android.graphics.Typeface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ej  reason: default package */
/* loaded from: classes.dex */
public final class ej {
    public final Context a;

    public ej(Context context, int i) {
        switch (i) {
            case 1:
                this.a = context;
                return;
            case 2:
                am8.s(context);
                Context applicationContext = context.getApplicationContext();
                am8.s(applicationContext);
                this.a = applicationContext;
                return;
            default:
                this.a = context.getApplicationContext();
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(defpackage.vq4 r5) {
        /*
            java.lang.String r0 = r5.o
            r1 = 0
            if (r0 == 0) goto L86
            boolean r0 = defpackage.lc7.m(r0)
            if (r0 != 0) goto Ld
            goto L86
        Ld:
            java.lang.String r5 = r5.o
            java.lang.String r0 = defpackage.a2d.a
            r5.getClass()
            int r0 = r5.hashCode()
            r2 = 4
            r3 = 1
            r4 = -1
            switch(r0) {
                case -1487656890: goto L61;
                case -1487464693: goto L56;
                case -1487464690: goto L4b;
                case -1487394660: goto L40;
                case -1487018032: goto L35;
                case -879272239: goto L2a;
                case -879258763: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L6b
        L1f:
            java.lang.String r0 = "image/png"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L28
            goto L6b
        L28:
            r4 = 6
            goto L6b
        L2a:
            java.lang.String r0 = "image/bmp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L33
            goto L6b
        L33:
            r4 = 5
            goto L6b
        L35:
            java.lang.String r0 = "image/webp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L3e
            goto L6b
        L3e:
            r4 = r2
            goto L6b
        L40:
            java.lang.String r0 = "image/jpeg"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L49
            goto L6b
        L49:
            r4 = 3
            goto L6b
        L4b:
            java.lang.String r0 = "image/heif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L54
            goto L6b
        L54:
            r4 = 2
            goto L6b
        L56:
            java.lang.String r0 = "image/heic"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L5f
            goto L6b
        L5f:
            r4 = r3
            goto L6b
        L61:
            java.lang.String r0 = "image/avif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L6a
            goto L6b
        L6a:
            r4 = r1
        L6b:
            switch(r4) {
                case 0: goto L76;
                case 1: goto L6f;
                case 2: goto L6f;
                case 3: goto L7c;
                case 4: goto L7c;
                case 5: goto L7c;
                case 6: goto L7c;
                default: goto L6e;
            }
        L6e:
            goto L81
        L6f:
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r5 < r0) goto L81
            goto L7c
        L76:
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r5 < r0) goto L81
        L7c:
            int r5 = defpackage.ei0.f(r2, r1, r1, r1)
            return r5
        L81:
            int r5 = defpackage.ei0.f(r3, r1, r1, r1)
            return r5
        L86:
            int r5 = defpackage.ei0.f(r1, r1, r1, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ej.b(vq4):int");
    }

    public Typeface a(rf rfVar) {
        Object gs9Var;
        Object obj = null;
        if (rfVar instanceof rf) {
            this.a.getClass();
            if (!(rfVar instanceof rf)) {
                rfVar = null;
            }
            if (rfVar != null) {
                if (!rfVar.b && rfVar.c == null) {
                    try {
                        gs9Var = Typeface.createFromFile(rfVar.e);
                    } catch (Throwable th) {
                        gs9Var = new gs9(th);
                    }
                    if (!(gs9Var instanceof gs9)) {
                        obj = gs9Var;
                    }
                    Typeface typeface = (Typeface) obj;
                    if (typeface == null) {
                        typeface = Typeface.DEFAULT;
                    }
                    rfVar.c = typeface;
                }
                rfVar.b = true;
                return rfVar.c;
            }
        }
        return null;
    }
}
