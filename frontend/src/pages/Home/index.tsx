import BarChart from "components/barChart";
import Datatable from "components/dataTable";
import DonutChart from "components/donutChart";
import Footer from "components/footer";
import Navbar from "components/navbar";

const Dashboard = () => {
    return (
        <>
            <Navbar />
            <div className="container">
                <h1 className="text-primary py-3">Dashboard de Vendas</h1>

                <div className="row px-3">
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Taxa de sucesso (%)</h5>
                        <BarChart />
                    </div>
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Todas vendas</h5>
                        <DonutChart />
                    </div>
                </div>

                <div className="py-3">
                    <h2 className="text-primary">Todas vendas</h2>
                </div>

                <Datatable />
            </div>
            <Footer />
        </>
    );
}

export default Dashboard;
