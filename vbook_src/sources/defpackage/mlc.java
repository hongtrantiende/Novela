package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mlc  reason: default package */
/* loaded from: classes3.dex */
public final class mlc extends aab implements ou4 {
    public final /* synthetic */ int a;
    public /* synthetic */ boolean b;
    public /* synthetic */ String c;
    public /* synthetic */ String d;
    public /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mlc(int i, int i2, m42 m42Var) {
        super(i, m42Var);
        this.a = i2;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                String str = this.c;
                String str2 = this.d;
                String str3 = this.e;
                hre.r(obj);
                return o17.s(new yk8("show_raw", String.valueOf(z)), new yk8("engine_id", str), new yk8("from_language", str2), new yk8("to_language", str3));
            default:
                boolean z2 = this.b;
                String str4 = this.c;
                String str5 = this.d;
                String str6 = this.e;
                hre.r(obj);
                return o17.s(new yk8("show_raw", String.valueOf(z2)), new yk8("engine_id", str4), new yk8("from_language", str5), new yk8("to_language", str6));
        }
    }

    @Override // defpackage.ou4
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Boolean bool = (Boolean) obj;
        switch (i) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                mlc mlcVar = new mlc(5, 0, (m42) obj5);
                mlcVar.b = booleanValue;
                mlcVar.c = (String) obj2;
                mlcVar.d = (String) obj3;
                mlcVar.e = (String) obj4;
                return mlcVar.invokeSuspend(pvcVar);
            default:
                boolean booleanValue2 = bool.booleanValue();
                mlc mlcVar2 = new mlc(5, 1, (m42) obj5);
                mlcVar2.b = booleanValue2;
                mlcVar2.c = (String) obj2;
                mlcVar2.d = (String) obj3;
                mlcVar2.e = (String) obj4;
                return mlcVar2.invokeSuspend(pvcVar);
        }
    }
}
