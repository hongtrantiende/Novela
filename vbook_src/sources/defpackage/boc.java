package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: boc  reason: default package */
/* loaded from: classes.dex */
public final class boc extends aoc {
    public final /* synthetic */ int d;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                int i = this.c;
                this.c = i + 2;
                Object[] objArr = this.a;
                return new u07(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.c;
                this.c = i2 + 2;
                return this.a[i2];
            default:
                int i3 = this.c;
                this.c = i3 + 2;
                return this.a[i3 + 1];
        }
    }
}
