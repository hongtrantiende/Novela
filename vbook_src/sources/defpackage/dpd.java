package defpackage;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dpd  reason: default package */
/* loaded from: classes.dex */
public final class dpd extends fs9 implements lu4 {
    public int b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ dp3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpd(dp3 dp3Var, m42 m42Var) {
        super(2, m42Var);
        this.f = dp3Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        dpd dpdVar = new dpd(this.f, m42Var);
        dpdVar.e = obj;
        return dpdVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((dpd) create((c9a) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int length;
        int i;
        Object mu9Var;
        Node node = (Node) this.f.a;
        c9a c9aVar = (c9a) this.e;
        int i2 = this.d;
        if (i2 != 0) {
            if (i2 == 1) {
                length = this.c;
                int i3 = this.b;
                hre.r(obj);
                i = i3 + 1;
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            length = node.getChildNodes().getLength();
            i = 0;
        }
        if (i < length) {
            node.getChildNodes().getLength();
            Node item = node.getChildNodes().item(i);
            if (item instanceof Element) {
                mu9Var = new dp3((Element) item);
            } else {
                item.getClass();
                mu9Var = new mu9(item);
            }
            this.e = c9aVar;
            this.b = i;
            this.c = length;
            this.d = 1;
            c9aVar.c(this, mu9Var);
            return n82.a;
        }
        return pvc.a;
    }
}
