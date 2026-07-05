package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m97  reason: default package */
/* loaded from: classes3.dex */
public final class m97 implements AutoCloseable {
    public final /* synthetic */ int a;
    public final Serializable b;
    public final Object c;

    /* JADX WARN: Type inference failed for: r0v2, types: [byte[], java.io.Serializable] */
    public m97(b50 b50Var) {
        this.a = 0;
        this.b = new byte[16];
        this.c = b50Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                return;
            default:
                oaa oaaVar = ((m96) this.c).c;
                oaaVar.getClass();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) oaaVar.d;
                q0a q0aVar = (q0a) concurrentHashMap.get((String) this.b);
                if (q0aVar != null) {
                    zg4 zg4Var = ((m96) oaaVar.b).d;
                    zg4Var.getClass();
                    yx5[] yx5VarArr = (yx5[]) ((ConcurrentHashMap) zg4Var.c).values().toArray(new yx5[0]);
                    ArrayList arrayList = new ArrayList();
                    for (yx5 yx5Var : yx5VarArr) {
                    }
                    Iterator it = arrayList.iterator();
                    if (!it.hasNext()) {
                        concurrentHashMap.remove(q0aVar.b);
                        return;
                    }
                    throw rs8.f(it);
                }
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return hl5.p(new StringBuilder("MemorySyncStreamBase("), ((b50) this.c).b, ')');
            default:
                return super.toString();
        }
    }

    public m97(String str, m96 m96Var) {
        this.a = 1;
        this.b = str;
        this.c = m96Var;
    }

    private final void o() {
    }
}
