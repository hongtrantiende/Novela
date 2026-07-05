package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y68  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class y68 implements vt4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y68(String str, z68 z68Var, int i, x68 x68Var) {
        this.c = str;
        this.d = z68Var;
        this.b = i;
        this.e = x68Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        int i2 = this.b;
        Serializable serializable = this.c;
        switch (i) {
            case 0:
                StringBuilder o = a82.o("Can not interpret the string '", (String) serializable, "' as ");
                o.append(((w68) ((z68) obj2).a.get(i2)).b);
                o.append(": ");
                o.append(((x68) obj).m());
                return o.toString();
            default:
                ((aw7) obj2).setValue(Boolean.FALSE);
                ((aw7) obj).setValue(((String[]) serializable)[i2]);
                return pvc.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ y68(String[] strArr, int i, aw7 aw7Var, aw7 aw7Var2) {
        this.c = strArr;
        this.b = i;
        this.d = aw7Var;
        this.e = aw7Var2;
    }
}
