package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j6b  reason: default package */
/* loaded from: classes.dex */
public final class j6b extends fb6 implements lu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6b(o6b o6bVar, nq7 nq7Var, lu4 lu4Var, int i) {
        super(2);
        this.c = o6bVar;
        this.d = nq7Var;
        this.e = lu4Var;
        this.b = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                k6b.b((o6b) obj5, (nq7) obj4, (lu4) obj3, (rv4) obj, xoe.p(this.b | 1));
                return pvcVar;
            default:
                ((Number) obj2).intValue();
                jye.e((String) obj5, (xy4) obj4, (nyb) obj3, this.b, (rv4) obj, 3073);
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6b(String str, xy4 xy4Var, nyb nybVar, int i, int i2) {
        super(2);
        this.c = str;
        this.d = xy4Var;
        this.e = nybVar;
        this.b = i;
    }
}
