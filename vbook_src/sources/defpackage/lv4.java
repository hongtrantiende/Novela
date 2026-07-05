package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lv4  reason: default package */
/* loaded from: classes.dex */
public final class lv4 {
    public int a;

    public lv4(int i) {
        this.a = i;
    }

    public final boolean a() {
        if (this.a != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String obj = super.toString();
        int i = this.a;
        return obj + "{ location = " + i + " }";
    }
}
