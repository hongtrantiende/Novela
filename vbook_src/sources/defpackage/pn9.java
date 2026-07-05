package defpackage;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.widget.RemoteViewsCompatService;
import com.vbook.android.R;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pn9  reason: default package */
/* loaded from: classes.dex */
public final class pn9 implements RemoteViewsService.RemoteViewsFactory {
    public static final uu5 e;
    public final RemoteViewsCompatService a;
    public final int b;
    public final int c;
    public uu5 d = e;

    /* JADX WARN: Type inference failed for: r0v0, types: [uu5, java.lang.Object] */
    static {
        long[] jArr = new long[0];
        RemoteViews[] remoteViewsArr = new RemoteViews[0];
        ?? obj = new Object();
        obj.c = jArr;
        obj.d = remoteViewsArr;
        obj.a = false;
        obj.b = 1;
        if (jArr.length == remoteViewsArr.length) {
            ArrayList arrayList = new ArrayList(remoteViewsArr.length);
            for (RemoteViews remoteViews : remoteViewsArr) {
                arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
            }
            int size = sl1.C0(sl1.G0(arrayList)).size();
            if (size <= 1) {
                e = obj;
                return;
            } else {
                p1a.k(hl5.l("View type count is set to 1, but the collection contains ", " different layout ids", size));
                throw null;
            }
        }
        vs.m("RemoteCollectionItems has different number of ids and views");
        throw null;
    }

    public pn9(RemoteViewsCompatService remoteViewsCompatService, int i, int i2) {
        this.a = remoteViewsCompatService;
        this.b = i;
        this.c = i2;
    }

    public final void a() {
        Long l;
        long j;
        RemoteViewsCompatService remoteViewsCompatService = this.a;
        SharedPreferences sharedPreferences = remoteViewsCompatService.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
        sharedPreferences.getClass();
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        sb.append(i);
        sb.append(':');
        sb.append(this.c);
        uu5 uu5Var = null;
        String string = sharedPreferences.getString(sb.toString(), null);
        if (string == null) {
            Log.w("RemoteViewsCompatServic", "No collection items were stored for widget " + i);
        } else {
            byte[] decode = Base64.decode(string, 0);
            decode.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.getClass();
            try {
                obtain.unmarshall(decode, 0, decode.length);
                obtain.setDataPosition(0);
                byte[] bArr = new byte[obtain.readInt()];
                obtain.readByteArray(bArr);
                String readString = obtain.readString();
                readString.getClass();
                long readLong = obtain.readLong();
                obtain.recycle();
                if (!c16.i(Build.VERSION.INCREMENTAL, readString)) {
                    Log.w("RemoteViewsCompatServic", "Android version code has changed, not using stored collection items for widget " + i);
                } else {
                    try {
                        PackageInfo packageInfo = remoteViewsCompatService.getPackageManager().getPackageInfo(remoteViewsCompatService.getPackageName(), 0);
                        if (Build.VERSION.SDK_INT >= 28) {
                            j = ru.o(packageInfo);
                        } else {
                            j = packageInfo.versionCode;
                        }
                        l = Long.valueOf(j);
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.e("RemoteViewsCompatServic", "Couldn't retrieve version code for " + remoteViewsCompatService.getPackageManager(), e2);
                        l = null;
                    }
                    if (l == null) {
                        Log.w("RemoteViewsCompatServic", "Couldn't get version code, not using stored collection items for widget " + i);
                    } else if (l.longValue() != readLong) {
                        Log.w("RemoteViewsCompatServic", "App version code has changed, not using stored collection items for widget " + i);
                    } else {
                        try {
                            Parcel obtain2 = Parcel.obtain();
                            obtain2.getClass();
                            obtain2.unmarshall(bArr, 0, bArr.length);
                            obtain2.setDataPosition(0);
                            uu5 uu5Var2 = new uu5(obtain2);
                            obtain2.recycle();
                            uu5Var = uu5Var2;
                        } catch (Throwable th) {
                            Log.e("RemoteViewsCompatServic", "Unable to deserialize stored collection items for widget " + i, th);
                        }
                    }
                }
            } catch (Throwable th2) {
                obtain.recycle();
                throw th2;
            }
        }
        if (uu5Var == null) {
            uu5Var = e;
        }
        this.d = uu5Var;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return ((long[]) this.d.c).length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return ((long[]) this.d.c)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return ((RemoteViews[]) this.d.d)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.a.getPackageName(), (int) R.layout.invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return this.d.b;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return this.d.a;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
