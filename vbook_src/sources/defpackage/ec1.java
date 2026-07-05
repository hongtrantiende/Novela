package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ec1  reason: default package */
/* loaded from: classes.dex */
public abstract class ec1 implements i39 {
    public abstract boolean a(char c);

    @Override // defpackage.i39
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
