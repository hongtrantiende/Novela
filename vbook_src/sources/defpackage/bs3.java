package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bs3  reason: default package */
/* loaded from: classes3.dex */
public final class bs3 implements gt5 {
    public final boolean a;

    public bs3(boolean z) {
        this.a = z;
    }

    @Override // defpackage.gt5
    public final p38 c() {
        return null;
    }

    @Override // defpackage.gt5
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.a) {
            str = "Active";
        } else {
            str = "New";
        }
        return s21.p(sb, str, '}');
    }
}
