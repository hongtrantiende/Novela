package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import com.vbook.android.R;
import java.lang.reflect.Field;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tid  reason: default package */
/* loaded from: classes.dex */
public final class tid implements View.OnApplyWindowInsetsListener {
    public final xb1 a;
    public tjd b;

    public tid(View view, xb1 xb1Var) {
        tjd tjdVar;
        hjd ajdVar;
        this.a = xb1Var;
        Field field = rcd.a;
        tjd a = lcd.a(view);
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 36) {
                ajdVar = new gjd(a);
            } else if (i >= 35) {
                ajdVar = new fjd(a);
            } else if (i >= 34) {
                ajdVar = new ejd(a);
            } else if (i >= 31) {
                ajdVar = new djd(a);
            } else if (i >= 30) {
                ajdVar = new cjd(a);
            } else if (i >= 29) {
                ajdVar = new bjd(a);
            } else {
                ajdVar = new ajd(a);
            }
            tjdVar = ajdVar.b();
        } else {
            tjdVar = null;
        }
        this.b = tjdVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j;
        int[] iArr;
        boolean z;
        boolean z2;
        if (!view.isLaidOut()) {
            this.b = tjd.c(windowInsets, view);
            if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }
        tjd c = tjd.c(windowInsets, view);
        qjd qjdVar = c.a;
        if (this.b == null) {
            Field field = rcd.a;
            this.b = lcd.a(view);
        }
        if (this.b == null) {
            this.b = c;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            xb1 i = uid.i(view);
            if (i != null && Objects.equals((tjd) i.c, c)) {
                if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                    return view.onApplyWindowInsets(windowInsets);
                }
            } else {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                tjd tjdVar = this.b;
                int i2 = 1;
                while (i2 <= 512) {
                    cx5 i3 = qjdVar.i(i2);
                    cx5 i4 = tjdVar.a.i(i2);
                    int i5 = i3.a;
                    int i6 = i3.d;
                    int i7 = i3.c;
                    int i8 = i3.b;
                    int i9 = i4.a;
                    int i10 = i4.d;
                    int[] iArr4 = iArr2;
                    int i11 = i4.c;
                    int i12 = i4.b;
                    if (i5 <= i9 && i8 <= i12 && i7 <= i11 && i6 <= i10) {
                        iArr = iArr3;
                        z = false;
                    } else {
                        iArr = iArr3;
                        z = true;
                    }
                    if (i5 >= i9 && i8 >= i12 && i7 >= i11 && i6 >= i10) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z != z2) {
                        if (z) {
                            iArr4[0] = iArr4[0] | i2;
                        } else {
                            iArr[0] = iArr[0] | i2;
                        }
                    }
                    i2 <<= 1;
                    iArr2 = iArr4;
                    iArr3 = iArr;
                }
                int i13 = iArr2[0];
                int i14 = iArr3[0];
                int i15 = i13 | i14;
                if (i15 == 0) {
                    this.b = c;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    tjd tjdVar2 = this.b;
                    if ((i13 & 8) != 0) {
                        interpolator = uid.e;
                    } else if ((i14 & 8) != 0) {
                        interpolator = uid.f;
                    } else if ((i13 & 519) != 0) {
                        interpolator = uid.g;
                    } else if ((i14 & 519) != 0) {
                        interpolator = uid.h;
                    } else {
                        interpolator = null;
                    }
                    if ((i15 & 8) != 0) {
                        j = 160;
                    } else {
                        j = 250;
                    }
                    zid zidVar = new zid(i15, interpolator, j);
                    zidVar.a.d(nae.e);
                    ValueAnimator duration = ValueAnimator.ofFloat(nae.e, 1.0f).setDuration(zidVar.a.a());
                    cx5 i16 = qjdVar.i(i15);
                    cx5 i17 = tjdVar2.a.i(i15);
                    int min = Math.min(i16.a, i17.a);
                    int i18 = i16.b;
                    int i19 = i17.b;
                    int min2 = Math.min(i18, i19);
                    int i20 = i16.c;
                    int i21 = i17.c;
                    int min3 = Math.min(i20, i21);
                    int i22 = i16.d;
                    int i23 = i17.d;
                    rwa rwaVar = new rwa(10, cx5.b(min, min2, min3, Math.min(i22, i23)), cx5.b(Math.max(i16.a, i17.a), Math.max(i18, i19), Math.max(i20, i21), Math.max(i22, i23)));
                    uid.f(view, zidVar, c, false);
                    duration.addUpdateListener(new rid(zidVar, c, tjdVar2, i15, view));
                    duration.addListener(new uz8(zidVar, view));
                    hc8.a(view, new sid(view, zidVar, rwaVar, duration, 0));
                    this.b = c;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            }
        }
        return windowInsets;
    }
}
