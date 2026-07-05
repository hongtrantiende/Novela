package defpackage;

import java.util.concurrent.Callable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zie  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zie implements Callable {
    public static final /* synthetic */ zie b = new zie(0);
    public static final /* synthetic */ zie c = new zie(1);
    public final /* synthetic */ int a;

    public /* synthetic */ zie(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                m2f m2fVar = new m2f("internal.platform", 4);
                m2fVar.b.put("getVersion", new m2f("getVersion", 3));
                return m2fVar;
            default:
                return null;
        }
    }
}
