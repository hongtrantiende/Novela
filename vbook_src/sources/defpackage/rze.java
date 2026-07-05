package defpackage;

import java.util.concurrent.Callable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rze  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rze implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uga b;

    public /* synthetic */ rze(uga ugaVar, int i) {
        this.a = i;
        this.b = ugaVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return this.b.a();
            default:
                return this.b.a();
        }
    }
}
