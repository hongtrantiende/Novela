package defpackage;

import android.os.StrictMode;
import java.util.Arrays;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q8f  reason: default package */
/* loaded from: classes.dex */
public abstract class q8f {
    public static final o8f a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        o8f o8fVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Iterator it = Arrays.asList(new o8f[0]).iterator();
            if (it.hasNext()) {
                o8f o8fVar2 = (o8f) it.next();
                wq9.C("Expected at most one FlagsService", !it.hasNext());
            } else {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                o8fVar = new Object();
            }
            a = o8fVar;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
