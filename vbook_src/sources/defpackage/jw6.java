package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jw6  reason: default package */
/* loaded from: classes.dex */
public final class jw6 extends hw6 {
    public final wq1 a = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [wq1, java.lang.Object] */
    public jw6(hq7 hq7Var) {
    }

    @Override // defpackage.hw6
    public final void a(iea ieaVar, String str, String str2, Throwable th) {
        str.getClass();
        str2.getClass();
        try {
            if (th == null) {
                int ordinal = ieaVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    if (ordinal == 5) {
                                        Log.println(7, str2, str);
                                        return;
                                    }
                                    throw new gt1(7);
                                }
                                Log.e(str2, str);
                                return;
                            }
                            Log.w(str2, str);
                            return;
                        }
                        Log.i(str2, str);
                        return;
                    }
                    Log.d(str2, str);
                    return;
                }
                Log.v(str2, str);
                return;
            }
            int ordinal2 = ieaVar.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            if (ordinal2 != 4) {
                                if (ordinal2 == 5) {
                                    Log.println(7, str2, str + '\n' + Log.getStackTraceString(th));
                                    return;
                                }
                                throw new gt1(7);
                            }
                            Log.e(str2, str, th);
                            return;
                        }
                        Log.w(str2, str, th);
                        return;
                    }
                    Log.i(str2, str, th);
                    return;
                }
                Log.d(str2, str, th);
                return;
            }
            Log.v(str2, str, th);
        } catch (Exception unused) {
            this.a.a(ieaVar, str, str2, th);
        }
    }
}
