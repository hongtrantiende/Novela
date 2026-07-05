package defpackage;

import j$.time.DateTimeException;
import j$.time.ZoneOffset;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h1d  reason: default package */
/* loaded from: classes3.dex */
public final class h1d extends d1 {
    public final f51 a;

    public h1d(f51 f51Var) {
        this.a = f51Var;
    }

    @Override // defpackage.d1
    public final f51 a() {
        return this.a;
    }

    @Override // defpackage.d1
    public final b72 b() {
        return i1d.d;
    }

    @Override // defpackage.d1
    public final Object d(b72 b72Var) {
        int i;
        Integer num;
        Integer num2;
        Integer num3;
        int i2;
        lt5 lt5Var = (lt5) b72Var;
        lt5Var.getClass();
        if (c16.i(lt5Var.a, Boolean.TRUE)) {
            i = -1;
        } else {
            i = 1;
        }
        Integer num4 = lt5Var.b;
        if (num4 != null) {
            num = Integer.valueOf(num4.intValue() * i);
        } else {
            num = null;
        }
        Integer num5 = lt5Var.c;
        if (num5 != null) {
            num2 = Integer.valueOf(num5.intValue() * i);
        } else {
            num2 = null;
        }
        Integer num6 = lt5Var.d;
        if (num6 != null) {
            num3 = Integer.valueOf(num6.intValue() * i);
        } else {
            num3 = null;
        }
        mfb mfbVar = k1d.a;
        int i3 = 0;
        try {
            if (num != null) {
                int intValue = num.intValue();
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = 0;
                }
                if (num3 != null) {
                    i3 = num3.intValue();
                }
                ZoneOffset ofHoursMinutesSeconds = ZoneOffset.ofHoursMinutesSeconds(intValue, i2, i3);
                ofHoursMinutesSeconds.getClass();
                return new f1d(ofHoursMinutesSeconds);
            } else if (num2 != null) {
                int intValue2 = num2.intValue() / 60;
                int intValue3 = num2.intValue() % 60;
                if (num3 != null) {
                    i3 = num3.intValue();
                }
                ZoneOffset ofHoursMinutesSeconds2 = ZoneOffset.ofHoursMinutesSeconds(intValue2, intValue3, i3);
                ofHoursMinutesSeconds2.getClass();
                return new f1d(ofHoursMinutesSeconds2);
            } else {
                if (num3 != null) {
                    i3 = num3.intValue();
                }
                ZoneOffset ofTotalSeconds = ZoneOffset.ofTotalSeconds(i3);
                ofTotalSeconds.getClass();
                return new f1d(ofTotalSeconds);
            }
        } catch (DateTimeException e) {
            xk5.m(e);
            return null;
        }
    }
}
