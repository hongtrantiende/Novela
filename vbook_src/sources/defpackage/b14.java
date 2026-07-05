package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b14  reason: default package */
/* loaded from: classes.dex */
public final class b14 {
    public final ajc a;
    public final int[] b;

    public b14(int i, ajc ajcVar, int[] iArr) {
        if (iArr.length == 0) {
            st0.i("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = ajcVar;
        this.b = iArr;
    }
}
