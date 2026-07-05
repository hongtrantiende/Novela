package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r93  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class r93 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p59 b;

    public /* synthetic */ r93(p59 p59Var, int i) {
        this.a = 1;
        this.b = p59Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        p59 p59Var = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                List list = (List) obj2;
                str.getClass();
                list.getClass();
                p59Var.b(str, list);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                lbe.a(p59Var, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 2:
                String str2 = (String) obj;
                List list2 = (List) obj2;
                str2.getClass();
                list2.getClass();
                p59Var.b(str2, list2);
                return pvcVar;
            default:
                String str3 = (String) obj;
                List list3 = (List) obj2;
                str3.getClass();
                list3.getClass();
                p59Var.b(str3, list3);
                return pvcVar;
        }
    }

    public /* synthetic */ r93(p59 p59Var, int i, byte b) {
        this.a = i;
        this.b = p59Var;
    }
}
