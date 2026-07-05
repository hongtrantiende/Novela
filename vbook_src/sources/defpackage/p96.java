package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p96  reason: default package */
/* loaded from: classes3.dex */
public interface p96 {
    default m96 getKoin() {
        m96 m96Var = hq7.J;
        if (m96Var != null) {
            return m96Var;
        }
        vs.k("KoinApplication has not been started");
        return null;
    }
}
