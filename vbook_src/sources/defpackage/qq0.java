package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qq0  reason: default package */
/* loaded from: classes3.dex */
public final class qq0 {
    public static final qq0 a;
    public static final /* synthetic */ qq0[] b;
    public static final /* synthetic */ qu3 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [qq0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [qq0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [qq0, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Total", 0);
        a = r0;
        qq0[] qq0VarArr = {r0, new Enum("Read", 1), new Enum("Listen", 2)};
        b = qq0VarArr;
        c = new qu3(qq0VarArr);
    }

    public static qq0 valueOf(String str) {
        return (qq0) Enum.valueOf(qq0.class, str);
    }

    public static qq0[] values() {
        return (qq0[]) b.clone();
    }
}
