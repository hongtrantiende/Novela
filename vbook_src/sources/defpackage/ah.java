package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ah  reason: default package */
/* loaded from: classes.dex */
public final class ah implements ViewTranslationCallback {
    public static final ah a = new Object();

    public final boolean onClearTranslation(View view) {
        vt4 vt4Var;
        view.getClass();
        kh contentCaptureManager$ui = ((rg) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f = hh.a;
        ny5 c = contentCaptureManager$ui.c();
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            tv7 tv7Var = ((d8a) objArr[(i << 3) + i3]).a.d.a;
                            Object g = tv7Var.g(h8a.E);
                            g4 g4Var = null;
                            if (g == null) {
                                g = null;
                            }
                            if (g != null) {
                                Object g2 = tv7Var.g(s7a.n);
                                if (g2 != null) {
                                    g4Var = g2;
                                }
                                g4 g4Var2 = g4Var;
                                if (g4Var2 != null && (vt4Var = (vt4) g4Var2.b) != null) {
                                    Boolean bool = (Boolean) vt4Var.invoke();
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean onHideTranslation(View view) {
        xt4 xt4Var;
        view.getClass();
        kh contentCaptureManager$ui = ((rg) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f = hh.a;
        ny5 c = contentCaptureManager$ui.c();
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            tv7 tv7Var = ((d8a) objArr[(i << 3) + i3]).a.d.a;
                            Object g = tv7Var.g(h8a.E);
                            g4 g4Var = null;
                            if (g == null) {
                                g = null;
                            }
                            if (c16.i(g, Boolean.TRUE)) {
                                Object g2 = tv7Var.g(s7a.m);
                                if (g2 != null) {
                                    g4Var = g2;
                                }
                                g4 g4Var2 = g4Var;
                                if (g4Var2 != null && (xt4Var = (xt4) g4Var2.b) != null) {
                                    Boolean bool = (Boolean) xt4Var.invoke(Boolean.FALSE);
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean onShowTranslation(View view) {
        xt4 xt4Var;
        view.getClass();
        kh contentCaptureManager$ui = ((rg) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f = hh.b;
        ny5 c = contentCaptureManager$ui.c();
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            tv7 tv7Var = ((d8a) objArr[(i << 3) + i3]).a.d.a;
                            Object g = tv7Var.g(h8a.E);
                            g4 g4Var = null;
                            if (g == null) {
                                g = null;
                            }
                            if (c16.i(g, Boolean.FALSE)) {
                                Object g2 = tv7Var.g(s7a.m);
                                if (g2 != null) {
                                    g4Var = g2;
                                }
                                g4 g4Var2 = g4Var;
                                if (g4Var2 != null && (xt4Var = (xt4) g4Var2.b) != null) {
                                    Boolean bool = (Boolean) xt4Var.invoke(Boolean.TRUE);
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }
}
