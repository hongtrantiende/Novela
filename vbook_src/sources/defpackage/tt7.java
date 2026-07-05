package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tt7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tt7 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6a b;

    public /* synthetic */ tt7(g6a g6aVar, int i) {
        this.a = i;
        this.b = g6aVar;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        g6a g6aVar = this.b;
        switch (i) {
            case 0:
                z5a z5aVar = (z5a) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                int intValue = ((Integer) obj3).intValue();
                ((Boolean) obj4).getClass();
                boolean z = g6aVar.c;
                if (booleanValue) {
                    if (z) {
                        return z5aVar.c(intValue, 0);
                    }
                    return z5aVar.c(intValue, z5aVar.f.a.a.b.length());
                } else if (z) {
                    return z5aVar.c(z5aVar.f.a.a.b.length(), intValue);
                } else {
                    return z5aVar.c(0, intValue);
                }
            default:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                ((Integer) obj3).getClass();
                boolean booleanValue3 = ((Boolean) obj4).booleanValue();
                g6a d = ((cu7) obj).d();
                if (d != null) {
                    f6a f6aVar = d.b;
                    f6a f6aVar2 = d.a;
                    if (booleanValue2) {
                        f6a f6aVar3 = g6aVar.a;
                        if (booleanValue3) {
                            return new g6a(f6aVar3, f6aVar2, true);
                        }
                        return new g6a(f6aVar3, f6aVar, false);
                    }
                    f6a f6aVar4 = g6aVar.b;
                    if (booleanValue3) {
                        return new g6a(f6aVar, f6aVar4, true);
                    }
                    return new g6a(f6aVar2, f6aVar4, false);
                }
                return null;
        }
    }
}
