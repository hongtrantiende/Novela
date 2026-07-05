package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tj  reason: default package */
/* loaded from: classes.dex */
public final class tj {
    public final wj a;
    public final int b;
    public final long c;
    public final dvb d;
    public final CharSequence e;
    public final List f;

    /* JADX WARN: Removed duplicated region for block: B:104:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01c8 A[EDGE_INSN: B:210:0x01c8->B:128:0x01c8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0343 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tj(defpackage.wj r22, int r23, int r24, long r25) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj.<init>(wj, int, int, long):void");
    }

    public final dvb a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        boolean z;
        ox8 ox8Var;
        float d = d();
        wj wjVar = this.a;
        pn pnVar = wjVar.C;
        int i8 = wjVar.H;
        bd6 bd6Var = wjVar.E;
        oyb oybVar = wjVar.b;
        uj ujVar = vj.a;
        gy8 gy8Var = oybVar.c;
        if (gy8Var != null && (ox8Var = gy8Var.b) != null) {
            z = ox8Var.a;
        } else {
            z = false;
        }
        return new dvb(charSequence, d, pnVar, i, truncateAt, i8, z, i3, i5, i6, i7, i4, i2, bd6Var);
    }

    public final float b() {
        return this.d.a();
    }

    public final long c(rk9 rk9Var, int i, p1a p1aVar) {
        int i2;
        m5a h15Var;
        int i3;
        int[] iArr;
        RectF C = ipe.C(rk9Var);
        if (i != 0 && i == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        sj sjVar = new sj(p1aVar, 0);
        dvb dvbVar = this.d;
        Layout layout = dvbVar.f;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            iArr = k4.m(dvbVar, C, i2, sjVar);
        } else {
            bm1 c = dvbVar.c();
            if (i2 == 1) {
                h15Var = new hvc(4, layout.getText(), dvbVar.l());
            } else {
                CharSequence text = layout.getText();
                TextPaint textPaint = dvbVar.a;
                if (i4 >= 29) {
                    h15Var = new g15(text, textPaint);
                } else {
                    h15Var = new h15(text);
                }
            }
            m5a m5aVar = h15Var;
            int lineForVertical = layout.getLineForVertical((int) C.top);
            if (C.top <= dvbVar.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < dvbVar.g) {
                int i5 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) C.bottom);
                if (lineForVertical2 != 0 || C.bottom >= dvbVar.i(0)) {
                    int m = lye.m(dvbVar, layout, c, i5, C, m5aVar, sjVar, true);
                    while (true) {
                        i3 = i5;
                        if (m != -1 || i3 >= lineForVertical2) {
                            break;
                        }
                        i5 = i3 + 1;
                        m = lye.m(dvbVar, layout, c, i5, C, m5aVar, sjVar, true);
                    }
                    if (m != -1) {
                        int i6 = lineForVertical2;
                        int m2 = lye.m(dvbVar, layout, c, i6, C, m5aVar, sjVar, false);
                        while (m2 == -1 && i3 < i6) {
                            i6--;
                            m2 = lye.m(dvbVar, layout, c, i6, C, m5aVar, sjVar, false);
                        }
                        if (m2 != -1) {
                            iArr = new int[]{m5aVar.d(m + 1), m5aVar.e(m2 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        if (iArr == null) {
            return fxb.b;
        }
        return sze.a(iArr[0], iArr[1]);
    }

    public final float d() {
        return x02.i(this.c);
    }

    public final void e(k61 k61Var) {
        Canvas a = tf.a(k61Var);
        dvb dvbVar = this.d;
        if (dvbVar.d) {
            a.save();
            a.clipRect(nae.e, nae.e, d(), b());
        }
        int i = dvbVar.h;
        if (a.getClipBounds(dvbVar.p)) {
            if (i != 0) {
                a.translate(nae.e, i);
            }
            ThreadLocal threadLocal = ivb.a;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new Canvas();
                threadLocal.set(obj);
            }
            vlb vlbVar = (vlb) obj;
            vlbVar.a = a;
            try {
                dvbVar.f.draw(vlbVar);
                if (i != 0) {
                    a.translate(nae.e, (-1.0f) * i);
                }
            } finally {
                vlbVar.a = null;
            }
        }
        if (dvbVar.d) {
            a.restore();
        }
    }

    public final void f(k61 k61Var, long j, nea neaVar, gpb gpbVar, bk3 bk3Var) {
        pn pnVar = this.a.C;
        int i = pnVar.c;
        pnVar.d(j);
        pnVar.f(neaVar);
        pnVar.g(gpbVar);
        pnVar.e(bk3Var);
        pnVar.b(3);
        e(k61Var);
        pnVar.b(i);
    }

    public final void g(k61 k61Var, hy0 hy0Var, float f, nea neaVar, gpb gpbVar, bk3 bk3Var) {
        pn pnVar = this.a.C;
        int i = pnVar.c;
        float d = d();
        float b = b();
        pnVar.c(hy0Var, (Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(d) << 32), f);
        pnVar.f(neaVar);
        pnVar.g(gpbVar);
        pnVar.e(bk3Var);
        pnVar.b(3);
        e(k61Var);
        pnVar.b(i);
    }
}
