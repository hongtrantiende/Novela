package defpackage;

import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u6d  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class u6d implements vt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ u6d(int i) {
        this.a = i;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return yae.z(Boolean.FALSE);
            case 1:
                return yae.z(Boolean.FALSE);
            case 2:
                return yae.z(Boolean.FALSE);
            case 3:
                return yae.z(Boolean.FALSE);
            case 4:
                return yae.z(new jub((String) null, 0L, 7));
            case 5:
                throw new IllegalStateException("LocalVideoLoader not set");
            case 6:
                sw2 sw2Var = ab3.a;
                n35 n35Var = zz6.a.f;
                b9b b = rse.b();
                n35Var.getClass();
                return k27.a(nq2.C(n35Var, b));
            case 7:
                mfb mfbVar = idd.a;
                return null;
            case 8:
                ff8[] values = ff8.values();
                values.getClass();
                return new ru3("androidx.compose.foundation.gestures.Orientation", values);
            case 9:
                return new lhd();
            case 10:
                throw new IllegalStateException("LocalWindowSizeClass not initialized");
            case 11:
                return new lh9(0);
            case 12:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case 13:
                npd npdVar = new npd(new hy(0));
                zi2.c(npdVar);
                fbe.w(npdVar, '-');
                zi2.f(npdVar);
                return new opd(npdVar.build());
            case 14:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
            default:
                return yae.z(Boolean.FALSE);
        }
    }
}
