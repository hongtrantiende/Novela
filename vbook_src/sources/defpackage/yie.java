package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yie  reason: default package */
/* loaded from: classes.dex */
public final class yie implements IInterface {
    public final IBinder a;

    public yie(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
