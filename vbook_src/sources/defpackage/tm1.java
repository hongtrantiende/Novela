package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tm1  reason: default package */
/* loaded from: classes.dex */
public abstract class tm1 {
    public static final p40 a = new p40("alpha", 1.0f);

    public static final jq6 a(String str) {
        jq6 t = tl1.t();
        for (int i = 0; i < str.length(); i++) {
            t.add(new p40(String.valueOf(str.charAt(i)), 1.0f));
        }
        t.add(a);
        return tl1.r(t);
    }
}
