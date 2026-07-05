package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zz6  reason: default package */
/* loaded from: classes3.dex */
public abstract class zz6 {
    public static final n35 a;

    /* JADX WARN: Type inference failed for: r0v4, types: [ei, java.lang.Object] */
    static {
        String str;
        int i = ogb.a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = g9a.e0(g9a.b0(Arrays.asList(new Object()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((ei) obj).getClass();
                    do {
                        ((ei) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((ei) obj) != null) {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    a = new n35(o35.a(mainLooper));
                    return;
                } else {
                    vs.k("The main looper is not available");
                    return;
                }
            }
            vs.k("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
