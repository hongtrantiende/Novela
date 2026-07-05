package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o4d  reason: default package */
/* loaded from: classes.dex */
public interface o4d {
    boolean a();

    long h(js jsVar, js jsVar2, js jsVar3);

    js l(long j, js jsVar, js jsVar2, js jsVar3);

    js u(long j, js jsVar, js jsVar2, js jsVar3);

    default js v(js jsVar, js jsVar2, js jsVar3) {
        return l(h(jsVar, jsVar2, jsVar3), jsVar, jsVar2, jsVar3);
    }
}
