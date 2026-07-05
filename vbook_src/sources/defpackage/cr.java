package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cr  reason: default package */
/* loaded from: classes.dex */
public final class cr extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ txb b;
    public final /* synthetic */ er c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cr(txb txbVar, er erVar, int i) {
        super(1);
        this.a = i;
        this.b = txbVar;
        this.c = erVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        er erVar = this.c;
        txb txbVar = this.b;
        switch (i) {
            case 0:
                long intValue = ((Number) obj).intValue();
                return (Integer) txbVar.invoke(Integer.valueOf(((int) (er.g(erVar) >> 32)) - ((int) (erVar.b.a((intValue << 32) | (intValue & 4294967295L), er.g(erVar), tc6.a) >> 32))));
            case 1:
                int intValue2 = ((Number) obj).intValue();
                long j = intValue2;
                return (Integer) txbVar.invoke(Integer.valueOf((-((int) (erVar.b.a((j << 32) | (4294967295L & j), er.g(erVar), tc6.a) >> 32))) - intValue2));
            case 2:
                long intValue3 = ((Number) obj).intValue();
                return (Integer) txbVar.invoke(Integer.valueOf(((int) (er.g(erVar) & 4294967295L)) - ((int) (erVar.b.a((intValue3 << 32) | (intValue3 & 4294967295L), er.g(erVar), tc6.a) & 4294967295L))));
            default:
                int intValue4 = ((Number) obj).intValue();
                long j2 = intValue4;
                return (Integer) txbVar.invoke(Integer.valueOf((-((int) (4294967295L & erVar.b.a((j2 << 32) | (j2 & 4294967295L), er.g(erVar), tc6.a)))) - intValue4));
        }
    }
}
