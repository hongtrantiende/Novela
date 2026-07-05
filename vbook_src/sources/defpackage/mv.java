package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mv  reason: default package */
/* loaded from: classes3.dex */
public final class mv {
    public static final hq7 b;
    public static final mv c;
    public static final mv d;
    public static final /* synthetic */ mv[] e;
    public static final /* synthetic */ qu3 f;
    public final String a;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hq7] */
    static {
        mv mvVar = new mv("None", "none", 0);
        c = mvVar;
        mv mvVar2 = new mv("Image", "image", 1);
        d = mvVar2;
        mv[] mvVarArr = {mvVar, mvVar2, new mv("Circles", "circles", 2), new mv("Grid", "grid", 3), new mv("Mesh", "mesh", 4), new mv("Particles", "particles", 5), new mv("Rings", "rings", 6), new mv("Shapes", "shapes", 7), new mv("Snow", "snow", 8), new mv("Space", "space", 9)};
        e = mvVarArr;
        f = new qu3(mvVarArr);
        b = new Object();
    }

    public mv(String str, String str2, int i) {
        this.a = str2;
    }

    public static mv valueOf(String str) {
        return (mv) Enum.valueOf(mv.class, str);
    }

    public static mv[] values() {
        return (mv[]) e.clone();
    }
}
