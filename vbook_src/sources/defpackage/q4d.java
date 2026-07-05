package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q4d  reason: default package */
/* loaded from: classes.dex */
public interface q4d extends r4d {
    int g();

    @Override // defpackage.o4d
    default long h(js jsVar, js jsVar2, js jsVar3) {
        return (g() + o()) * 1000000;
    }

    int o();
}
