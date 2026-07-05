package defpackage;

import java.util.function.IntConsumer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntConsumer b;
    public final /* synthetic */ int c;

    public /* synthetic */ yu(IntConsumer intConsumer, int i, int i2) {
        this.a = i2;
        this.b = intConsumer;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.c;
        IntConsumer intConsumer = this.b;
        switch (i) {
            case 0:
                intConsumer.accept(i2);
                return;
            default:
                intConsumer.accept(i2);
                return;
        }
    }
}
