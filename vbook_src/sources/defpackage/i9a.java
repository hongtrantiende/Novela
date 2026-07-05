package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i9a  reason: default package */
/* loaded from: classes3.dex */
public final class i9a extends fs9 implements lu4 {
    public final /* synthetic */ lu4 C;
    public Iterator b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ff4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9a(ff4 ff4Var, lu4 lu4Var, m42 m42Var) {
        super(2, m42Var);
        l9a l9aVar = l9a.a;
        this.f = ff4Var;
        this.C = lu4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        l9a l9aVar = l9a.a;
        i9a i9aVar = new i9a(this.f, this.C, m42Var);
        i9aVar.e = obj;
        return i9aVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((i9a) create((c9a) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i;
        Iterator ef4Var;
        c9a c9aVar = (c9a) this.e;
        int i2 = this.d;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.c;
                ef4Var = this.b;
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            i = 0;
            ef4Var = new ef4(this.f);
        }
        while (true) {
            boolean hasNext = ef4Var.hasNext();
            Object obj2 = pvc.a;
            if (hasNext) {
                Object next = ef4Var.next();
                int i3 = i + 1;
                if (i >= 0) {
                    Iterator it = (Iterator) l9a.a.invoke(this.C.invoke(new Integer(i), next));
                    this.e = c9aVar;
                    this.b = ef4Var;
                    this.c = i3;
                    this.d = 1;
                    c9aVar.getClass();
                    boolean hasNext2 = it.hasNext();
                    Object obj3 = n82.a;
                    if (hasNext2) {
                        c9aVar.c = it;
                        c9aVar.a = 2;
                        c9aVar.d = this;
                        obj2 = obj3;
                    }
                    if (obj2 == obj3) {
                        return obj3;
                    }
                    i = i3;
                } else {
                    tl1.M();
                    throw null;
                }
            } else {
                return obj2;
            }
        }
    }
}
