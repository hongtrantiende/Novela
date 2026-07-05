package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eid  reason: default package */
/* loaded from: classes.dex */
public final class eid {
    public static final eid a;
    public static final eid b;
    public static final /* synthetic */ eid[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [eid, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eid, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Start", 0);
        a = r0;
        ?? r1 = new Enum("End", 1);
        b = r1;
        c = new eid[]{r0, r1};
    }

    public static eid valueOf(String str) {
        return (eid) Enum.valueOf(eid.class, str);
    }

    public static eid[] values() {
        return (eid[]) c.clone();
    }
}
